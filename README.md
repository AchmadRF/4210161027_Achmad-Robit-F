# 4210161027_Achmad-Robit-F

Game Dota 2:
1. posisi pemain
2. ID pemain yang disinkronisasi dengan Steam
3. ID karakter yang digunakan pemain
4. posisi spawn AI
5. ID shop

Kendala untuk bagian server masih belum jadi dan untuk kelas Player masih memiliki atribut yang minim

Method kerja 
1. Client mengirim class Player yang berupa object dan kemudian diubah menjadi byte data menggunakan ByteArrayOutputStream().
2. Server menerima byte data yang dikirim dengan menggunakan methode ByteArrayInputStream() lalu data diubah kembali menjadi class
3. Pada server data ditampilkan
