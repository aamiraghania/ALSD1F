public class BinaryTree01 {
    Node01 root;

    public BinaryTree01() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa01 mahasiswa) {
        Node01 newNode = new Node01(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node01 current = root;
            Node01 parent = null;
            while(true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    //Tambahan addRekursif
    public void addRekursif(Mahasiswa01 data) {
        root = tambahRekursif(root, data);
    }

    private Node01 tambahRekursif(Node01 current, Mahasiswa01 data) {
        if (current == null) {
            return new Node01(data);
        }
        if (data.ipk < current.mahasiswa.ipk) {
            current.left = tambahRekursif(current.left, data);
        } else {
            current.right = tambahRekursif(current.right, data);
        }
        return current;
    }

    public Mahasiswa01 cariMinIPK() {
        return minNode(root).mahasiswa;
    }

    private Node01 minNode(Node01 current) {
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public Mahasiswa01 cariMaxIPK() {
        return maxNode(root).mahasiswa;
    }

    private Node01 maxNode(Node01 current) {
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilRekursif(root, ipkBatas);
    }

    private void tampilRekursif(Node01 current, double ipkBatas) {
        if (current != null) {
            tampilRekursif(current.left, ipkBatas);
            if (current.mahasiswa.ipk > ipkBatas) {
                current.mahasiswa.tampilInformasi();
            }
            tampilRekursif(current.right, ipkBatas);
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node01 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node01 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node01 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node01 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node01 getSuccessor(Node01 del) {
        Node01 successor = del.right;
        Node01 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node01 parent = root;
        Node01 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
         //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {//jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //jika punya 2 anak
                Node01 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;                
            }
        }
}
}