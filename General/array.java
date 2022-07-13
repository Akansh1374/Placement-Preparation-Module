public class array{
    public static void main(String[] args){
        int i,j;
        String[][] cars={{"BMW","audi","tesla"},
                         {"lambo","mercedes","buggati"}
                        };

    for(i=0;i<cars.length;i++){
        System.out.println("  ");
        for(j=0;j<cars[i].length;j++){
            System.out.print(cars[i][j]+"  ");
        }
    }


    }
}