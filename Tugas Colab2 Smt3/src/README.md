# Kalkulator Hitung Luas

Kalkulator Hitung Luas adalah aplikasi Java sederhana untuk menghitung luas berbagai bentuk geometri seperti persegi, persegi panjang, dan segitiga.

## Struktur Proyek

Aplikasi ini terdiri dari beberapa kelas yang diatur dalam paket `refactor`, dengan satu kelas utama (`MainR`) yang menjalankan logika program utama.

- **MainR.java**: Berisi program utama yang menyediakan antarmuka konsol bagi pengguna untuk memilih bentuk dan menghitung luasnya.
- **Tugas4R.java**: Berisi metode statis untuk menghitung luas dari objek `persegi`, `persegipanjang`, dan `segitiga`.
- **refactor.persegi**: Kelas untuk representasi persegi.
- **refactor.persegipanjang**: Kelas untuk representasi persegi panjang.
- **refactor.segitiga**: Kelas untuk representasi segitiga.

## Fitur

- Menghitung luas persegi dengan parameter sisi.
- Menghitung luas persegi panjang dengan parameter panjang dan lebar.
- Menghitung luas segitiga dengan parameter alas dan tinggi.

## Cara Penggunaan

1. Jalankan aplikasi dari kelas `MainR`.
2. Anda akan diminta untuk memilih bentuk yang ingin dihitung luasnya:
    - Ketik `1` untuk menghitung luas persegi.
    - Ketik `2` untuk menghitung luas persegi panjang.
    - Ketik `3` untuk menghitung luas segitiga.
3. Masukkan nilai yang diminta.
4. Program akan menampilkan luas bentuk yang dipilih.

## Contoh Output

```text
Selamat datang di Kalkulator hitung luas
1. Hitung Luas Persegi
2. Hitung Luas Persegi Panjang
3. Hitung Luas Segitiga
Pilih No 1-3: 1
Masukkan panjang sisi persegi: 5
Luas Persegi adalah: 25.0 cm²
