public class ThrowExample {
  static void demo() {
    NullPointerException t;
    t = new NullPointerException("Coba Throw");
    throw t;

    System.out.println("Ini tidak lagi dicetak");
  }

  public static void main(String[] args) {
    try {
      demo();
      System.out.println("Selesai");
    } catch (NullPointerException e) {
      System.out.println("Ada pesan error: " + e);
    }
  }
}

// Elemen Fungsi
// throw Melempar exception secara manual (dalam hal ini, NullPointerException).
// try Mencoba menjalankan kode yang mungkin akan menimbulkan exception.
// catch Menangani exception yang dilempar agar program tidak crash.
// Hasil Program tidak berhenti mendadak, tapi mencetak pesan kesalahan dari
// exception yang ditangkap.
// Baris yang dilewati Semua kode setelah throw dan setelah pemanggilan demo()
// dalam try tidak akan dieksekusi karena exception langsung ditangani.