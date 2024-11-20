Penjelasan 
1.	Menambahkan fitur ubah, verifikasi pin lama, minta nasabah mamasukan pin baru dan validasi kedua input pin baru cocok
Penjelasan:
Dalam menambahkan fitur ubah pin pertama tama yaitu kita menambahkan method baru yaitu method changepin . kemudian membuat objek scanner untuk membaca dari data yang dimasukan user. Buat minta pin lama baca input user kemudian di simpan di variable oldpin. Buat verifikasi pin lama dia pakai if jika tidak sesuai sama si oldpin nanti dia akan mengeluarkan pernyataan pin lama tidak sesuai. Kemudian untuk membuat pin baru kita buat newpin1 dari scanner terus newpin2 buat konfirmasi pin baru. Setelah itu untuk validasi pin pakai if dimana(newPin1.equals(newPin2)), untuk memeriksa apakah nilai string newPin1 (PIN baru yang dimasukkan pertama kali) sama dengan newPin2 (konfirmasi PIN baru). Metode .equals() dipakai buat membandingkan isi dari dua string, karena dalam Java, operator == buat membandingkan. Jika kondisi ini true, berarti user sudah memasukkan PIN baru dengan benar dua kali, sehingga PIN lama (this.pin) dapat diperbarui ke newPin1. Dan di atm kita tambahin chocenya buat change pin

2.	Untuk menentukan saldo minimal pada minimum_balance di celas account dan modifikasi methode execute() pada withdrawal untuk memeriksa saldo penarikan tidak kurang dari saldo minimal dan menampilkan pesan saldi tidak mencukupi.
Penjelasan
Pertama tama kita deklarasiin variable minimum balance dengan public static dengan nilai yang gak bisa di ubah. Teruskita ubah jadi  if (amount <= account.getBalance() - Account.MINIMUM_BALANCE) supaya jumlah transaksi (amount) tidak melebihi saldo yang tersedia di akun (account.getBalance()), dikurangi saldo minimum (Account.MINIMUM_BALANCE). Jika true, metode account.debit(amount) akan mengurangi saldo akun sebesar amount. Terus kasih else Jika gak true nanti menyampaikan pesan saldo tidak cukup

![hasil run](https://github.com/user-attachments/assets/4008346a-41ad-41cb-a90a-90a93e358d76)
![hasil run1](https://github.com/user-attachments/assets/83aba5dc-6557-40b8-a533-11eaf8c239b2)



