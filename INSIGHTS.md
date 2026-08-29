{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyOzjq6vjxrkijIVuc28NCBj",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/aamiraghania/ALSD1F/blob/main/INSIGHTS.md\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "Dokumen ini merangkum 5 pertanyaan bisnis inti yang dijawab melalui analisis data penjualan e-commerce (Amazon India, 2022), lengkap dengan insight dan rekomendasi bisnis untuk masing-masing.\n",
        "\n",
        "---\n",
        "\n",
        "#### **1. Kategori produk apa yang paling laku dan paling menyumbang revenue?**\n",
        "\n",
        "**Jawaban:**\n",
        "Set adalah kategori dengan kontribusi revenue tertinggi, menyumbang 49,88% dari total revenue (Rp39,2 juta), diikuti Kurta di posisi kedua dengan 27,10%. Kedua kategori ini bersama-sama menguasai 76,98% dari seluruh revenue, menunjukkan ketergantungan bisnis yang tinggi pada dua kategori saja. Menariknya, Set unggul bukan hanya dari volume order (50.272 order) tetapi juga dari nilai rata-rata per transaksi (AOV Rp832,00) — tertinggi di seluruh kategori. Sementara itu, Kurta mengandalkan volume tinggi dengan harga rata-rata jauh lebih rendah (Rp455,76). Temuan menarik lainnya adalah Saree, yang meski hanya menyumbang 0,16% revenue karena volume order sangat kecil (164 order), memiliki AOV kedua tertinggi (Rp802,06) — mengindikasikan produk premium yang kurang mendapat eksposur pasar.\n",
        "\n",
        "**Rekomendasi:** Pertahankan dan perkuat investasi marketing di kategori Set sebagai andalan utama, sekaligus uji coba peningkatan visibility untuk Saree yang berpotensi menjadi kontributor margin tinggi jika volumenya digenjot.\n",
        "\n",
        "---\n",
        "\n",
        "#### **2. Sales channel dan fulfillment method (Amazon FBA vs Merchant) mana yang lebih efisien — dilihat dari rasio order cancel/return?**\n",
        "\n",
        "**Jawaban:**\n",
        "Fulfillment Amazon (FBA) terbukti lebih efisien dibanding Merchant (self-fulfillment oleh seller), dengan cancel rate 12,79% berbanding 17,47% — selisih 4,68 poin persentase dari total 39.264 order yang menggunakan skema Merchant. Untuk sales channel, \"Amazon.in\" mendominasi 99,9% transaksi (128.818 dari 128.942 order), sehingga tidak cukup data pembanding yang representatif dari channel lain untuk ditarik kesimpulan. Perlu dicatat pula keterbatasan data: granularitas status pengiriman untuk fulfillment Amazon tidak selengkap Merchant, sehingga analisis delivery success rate secara detail belum bisa dilakukan sepenuhnya adil antar kedua metode.\n",
        "\n",
        "**Rekomendasi:** Dorong migrasi seller dari skema Merchant ke Amazon fulfillment untuk menurunkan cancel rate — meski ada tambahan biaya fulfillment, potensi penyelamatan revenue dari penurunan cancel rate 4-5 poin kemungkinan besar sepadan dengan biaya tersebut.\n",
        "\n",
        "---\n",
        "\n",
        "#### **3. Wilayah (state/kota) mana penyumbang penjualan terbesar?**\n",
        "\n",
        "**Jawaban:**\n",
        "Maharashtra adalah kontributor revenue terbesar (16,97% dari total, Rp13,3 juta), diikuti Karnataka (13,34%) dan Telangana (8,80%). Secara keseluruhan, 10 dari 47 state menyumbang 78,72% total revenue, menunjukkan konsentrasi geografis yang signifikan. Temuan penting: Kerala, meski masuk top 10 revenue, memiliki cancel rate tertinggi kedua secara keseluruhan (17,84%) — kombinasi volume besar dengan masalah operasional tinggi menjadikannya prioritas perbaikan. Selain itu, beberapa state kecil seperti Himachal Pradesh (18,53%), Andaman & Nicobar (17,51%), dan Jammu & Kashmir (16,95%) memiliki cancel rate tertinggi di seluruh dataset meski kontribusi revenue-nya di bawah 1% — kemungkinan terkait tantangan logistik di wilayah terpencil.\n",
        "\n",
        "**Rekomendasi:** Perkuat dominasi di Maharashtra dan Karnataka sebagai pasar inti, investigasi serius penyebab cancel tinggi di Kerala karena dampaknya signifikan pada skala, dan evaluasi opsi pengiriman khusus untuk wilayah geografis terpencil.\n",
        "\n",
        "---\n",
        "\n",
        "#### **4. Bagaimana tren penjualan harian/mingguan sepanjang periode data — ada pola tertentu?**\n",
        "\n",
        "**Jawaban:**\n",
        "Data mencakup periode singkat, dari 31 Maret hingga awal Juni 2022 (sekitar 61 hari), sehingga tren yang teridentifikasi bersifat jangka pendek, bukan pola musiman tahunan yang sudah teruji. Pola yang terlihat: lonjakan tajam di awal periode (minggu 10 April, naik 131,5%), kemudian stabil di kisaran Rp5-7 juta per minggu sepanjang April, sebelum melandai memasuki Mei. Ditemukan anomali kritis pada minggu 8 Mei dengan revenue tercatat Rp0 — ini kemungkinan besar gap pencatatan data (bukan penurunan bisnis riil) dan perlu dikecualikan dari kesimpulan tren. Data di ujung periode (awal Juni) juga kemungkinan belum lengkap karena dataset terpotong di tengah minggu.\n",
        "\n",
        "**Rekomendasi:** Investigasi lebih lanjut penyebab lonjakan awal April (kemungkinan terkait periode menjelang Idul Fitri di pasar India, relevan untuk kategori fashion), dan pastikan proses pencatatan data diperbaiki agar tidak ada gap seperti pada minggu 8 Mei di periode mendatang, karena data yang hilang dapat menyesatkan pengambilan keputusan berbasis tren.\n",
        "\n",
        "---\n",
        "\n",
        "#### **5. Ukuran (size) produk apa yang paling sering dipesan per kategori?**\n",
        "\n",
        "**Jawaban:**\n",
        "Secara umum, size M, L, dan XL adalah kontributor volume terbesar di hampir seluruh kategori — misalnya size M terbanyak di kategori Set (18,59%) dan size L terbanyak di Kurta (18,14%), dengan distribusi yang relatif merata di rentang S hingga XXL. Temuan paling penting: cancel rate menurun secara konsisten seiring size membesar, dari 17,29% di size XS hingga hanya 9,81% di size 4XL — indikasi kuat adanya masalah fit/sizing pada ukuran kecil yang menyebabkan lebih banyak pembatalan. Kategori Saree dan Blouse tercatat 100% menggunakan \"Free Size\" karena karakteristik produknya berbeda (kain/unstitched), sehingga dikecualikan dari analisis size standar.\n",
        "\n",
        "**Rekomendasi:** Prioritaskan audit size chart dan perbaikan deskripsi ukuran khususnya untuk size XS dan S, karena volumenya cukup besar (XS: 6.583 unit, S: 10.083 unit) namun cancel rate-nya tertinggi — perbaikan di titik ini berpotensi menyelamatkan revenue yang signifikan dari pembatalan akibat kesalahan ekspektasi ukuran.\n",
        "\n",
        "---\n",
        "\n",
        "*Sumber data: [E-Commerce Sales Dataset](https://www.kaggle.com/datasets/thedevastator/unlock-profits-with-e-commerce-sales-data) — Kaggle, dataset publik penjualan Amazon India periode Maret–Juni 2022.*"
      ],
      "metadata": {
        "id": "yZz3hgFRlGmB"
      }
    }
  ]
}