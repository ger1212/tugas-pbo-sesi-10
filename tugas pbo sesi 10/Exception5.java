public class Exception5 {
  public static void main(String[] args) {
    int bil = 10;
    try {
      System.out.println(bil / 0);
    } catch (ArithmeticException e) {
      System.out.println("Pesan error: ");
      System.out.println(e.getMessage());
      System.out.println("Info stack erase");
      e.printStackTrace();
      e.printStackTrace(System.out);
    } catch (Exception e) {
      System.out.println("Ini menghandle error yang terjadi");
    }
  }
}

// Bagian try
// System.out.println(bil / 0);

// Baris ini mencoba membagi bilangan 10 dengan 0.

// Dalam Java, ini akan menimbulkan ArithmeticException karena pembagian dengan
// nol tidak diperbolehkan untuk bilangan bulat (int).

// Exception ini terjadi saat runtime.

// catch(ArithmeticException e)
// Blok ini secara spesifik menangani kesalahan pembagian dengan nol.

// Akan mencetak:

// Pesan error: biasanya "/ by zero"

// Stack trace: menunjukkan di baris mana error terjadi dalam program.

// e.printStackTrace() dan e.printStackTrace(System.out) melakukan hal yang
// sama, yaitu menampilkan jejak eksekusi (stack trace), namun output-nya bisa
// diarahkan ke stream yang berbeda (di sini ke layar).