import java.util.ArrayList;

// Class Core (Inti)
public class Library {
    static ArrayList<Buku> bukuList = new ArrayList<>();
    static ArrayList<Staff> staffList = new ArrayList<>();

    public static Staff findStaff(String nik) {
        for (Staff staff : staffList) {
            if (staff.nik.equals(nik)) {
                return staff;
            }
        }
        return null;
    }

    public static Buku findBukuById(int id) {
        for (Buku buku : bukuList) {
            if (buku.idBuku == id) {
                return buku;
            }
        }
        return null;
    }

    public static Buku findBukuByTitle(String title) {
        for (Buku buku : bukuList) {
            if (buku.judulBuku.contains(title)) {
                return buku;
            }
        }
        return null;
    }

    private static int indexData(Buku buku) {
        for (int i = 0; i < bukuList.size(); i++) {
            if (bukuList.get(i).idBuku == buku.idBuku) {
                return i;
            }
        }
        return -1;
    }

    public static void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public static void updateBuku(Buku buku) {
        int indexBukuList = indexData(buku);

        if (indexBukuList != -1) {
            bukuList.set(indexBukuList, buku);
        }
    }

    public static void deleteBuku(Buku buku) {
        bukuList.remove(buku);

    }
}
