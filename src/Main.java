public class Main {
    public static void main(String[] args) {
        GriffindorStudent potter = new GriffindorStudent("potter", 10, 5, 3, 7, 1);
        GriffindorStudent ron = new GriffindorStudent("ron", 8, 7, 5, 1, 5);
        GriffindorStudent germiona = new GriffindorStudent("germiona", 7, 8, 6, 2, 7);

        HufflepuffStudent smith = new HufflepuffStudent("smith", 7, 8,2,4,6);
        HufflepuffStudent sedrik = new HufflepuffStudent("sedrik", 8, 9,5,2,7);
        HufflepuffStudent justin = new HufflepuffStudent("justin", 4, 3,6,4,1);

        RavenclawStudent zhou = new RavenclawStudent("zhou", 3,5,6,2,6);
        RavenclawStudent padma = new RavenclawStudent("padma", 4,5,3,6,3);
        RavenclawStudent marcus = new RavenclawStudent("marcus", 5,6,2,7,3);

        SlytherinStudent draco = new SlytherinStudent("draco", 3,4,5,6,7,8,2);
        SlytherinStudent graham = new SlytherinStudent("graham", 3,4,6,8,5,3,7);
        SlytherinStudent goyle = new SlytherinStudent("goyle", 2,4,7,3,5,2,4);


        potter.compareTo(draco);
        graham.compareTo(goyle);


        System.out.println(potter);


    }
}