import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		//Array:
//		String [] member = {"Richard", "Kenneth", "Vannes", "Aeriell"};
//		
//		for(int i = 0; i<4; i++) {
//			System.out.println(member[i]);
//		}
		
//		//ArrayList & Vector
//		ArrayList<String> nilai = new ArrayList<>();
//		nilai.add("100");
//		Vector<Integer> angka = new Vector<>();
//		
//		ArrayList<String> buah = new ArrayList<>();
//		
//		//add() --> untuk memasukkan data ke array list / vector
//		buah.add("Jeruk");
//		buah.add("Semangka");
//		
//		buah.set(0, "Melon");//set --> untuk mengubah data dalam array list
//		
//		buah.add("Strawberry");
//		buah.add("Anggur");
//		buah.add("Mangga");
//		buah.add("Pepaya");
//		
//		System.out.println(buah);
//		
//		System.out.println(buah.get(1));
//		
//		buah.remove(0);
//		
//		System.out.println(buah.get(1));
//		
//		System.out.println("Ukuran list buah: " + buah.size()); 
//		
//		buah.removeAll(buah);// removeAll() --> untuk menghapus semua data dalam arrList atau Vector
//		
//		
//		System.out.println(buah);
		
		
		int input;
		ArrayList<String> stockBuah = new ArrayList<>();
		ArrayList<String> removeBuah = new ArrayList<>();
		//praktek removeAlll
		
		do {
			
			System.out.println("Halo!, Masukkan Action Stock Buah");
			System.out.println("1. Input stock");
			System.out.println("2. Remove stock");
			System.out.println("3. Edit Stock");
			System.out.println("4. View");
			System.out.print("Masukkan inputan: ");
			
			input = scan.nextInt();
			scan.nextLine();
			
			System.out.println();
			
			switch (input) {
			case 1: {
				System.out.print("Masukkan Nama buah: ");
				String namaBuah = scan.nextLine(); //^[\n]
				stockBuah.add(namaBuah);
				
				break;
			}
			
			case 2:{
				System.out.println("Berikut daftar stock buah");
				for(int i=0; i<stockBuah.size(); i++) {
					System.out.println((i+1) + ". " + stockBuah.get(i));
				}
				
				System.out.println();
				
				System.out.println("Masukkan jumlah buah yang ingin dihapus: ");
				Integer nBuah = scan.nextInt();
				scan.nextLine();
				
				System.out.println();
				
				System.out.println("Masukkan nama buah yang ingin di hapus: ");
				
				for(int i=0; i<nBuah; i++) {
					String sBuah = scan.nextLine();
					removeBuah.add(sBuah);
				}
				
				stockBuah.removeAll(removeBuah);
				
				removeBuah.removeAll(removeBuah);
				
				break;
			}
			
			case 3:{
				System.out.println("Berikut daftar stock buah");
				for(int i=0; i<stockBuah.size(); i++) {
					System.out.println((i+1) + ". " + stockBuah.get(i));
				}
				
				System.out.println();
				
				System.out.println("Masukkan nomor buah yang ingin di-edit: ");
				Integer nBuah = scan.nextInt();
				scan.nextLine();
				
				System.out.println();
				
				System.out.println("Masukkan nama buah: ");
				String editBuah = scan.nextLine();
				
				stockBuah.set(nBuah-1, editBuah);
				
				break;
			}
			
			case 4: {
				System.out.println("Berikut daftar stock buah");
				for(int i=0; i<stockBuah.size(); i++) {
					System.out.println((i+1) + ". " + stockBuah.get(i));
				}
				break;
			}
			default:
				System.out.println("Mohon maaf, menu belum tersedia :(");
			}
			System.out.println();
			System.out.println();
			
		} while (input != 5);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
