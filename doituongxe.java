public class doituongxe {
    int Giaxe;

    public doituongxe(String ten){
        System.out.println("Ten xe la :" + ten );
    }
    public void xetGia( int gia ){
        Giaxe = gia;
    }

    public int giathitruong( ){
        System.out.println("Gia mua xe la :" + Giaxe );
        return Giaxe;
    }
    public static void main(String []args){
        /* Tao doi tuong */
        doituongxe Xecuatoi = new doituongxe( "wave 110" );
        Xecuatoi.xetGia( 150000 );
        Xecuatoi.giathitruong( );
        System.out.println("Gia tri bien :" + Xecuatoi.Giaxe );
    }
}

