public class Suduko {
  private static void printSol(int[][] grid){
        for(int rw = 0; rw < 9; rw++){
          
            if(rw %3 == 3 && rw !=0){
                System.out.println("------------");
            }
            for(int cl = 0; cl < 9; cl++){
          
                if(cl %3 == 3 && cl !=0){
                System.out.println("|");
            }
               System.out.print(grid[rw][cl] + " ") ;
            }
            System.out.println();
         }
    }
    /
    
    private static boolean isNumberInRow(int[][] grid,int Nbre,int rw){
        for(int i = 0; i < 9; i++){
            if (grid[rw][i] == Nbre){
                return true;
            }
        }
        return false;
    }
    
    private static boolean isNumberInCol(int[][] grid,int Nbre,int cl){
        for(int i = 0; i < 9; i++){
            if (grid[i][cl] == Nbre){
                return true;
            }
        }
        return false;
    }
    private static boolean Solvesudoku(int[][] grid){
        for(int rw = 0; rw < 9; rw++){
            for(int cl = 0; cl < 9; cl++){
                if (grid[rw][cl] == 0){
                    for(int k = 1; k <= 9; k++){
                        if(isValid(grid, k, rw, cl)){
                            grid[rw][cl] = k ;
                            
                            if( Solvesudoku(grid)){
                                return true ;
                            }
                            else{
                                grid[rw][cl] = 0 ;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

static void print(int grid[][])
{
for (int i = 0; i < p.length; i++) {
for (int j = 0; j < grid[0].length; j++) {
System.out.printf("%d ", grid[i][j]);
}
System.out.println();
}
}


public static void main(String args[])
{

        int[][] grid = new int[9][9];
        for(int i = 0; i < grid.length; i++){
            grid[i] = new int[9];
        }
        
        do{
    
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                System.out.print(String.format("Entrez a[%d][%d] : ", i+1, j+1));
                grid[i][j] = sc.nextInt();
            }
        }
        
        printSol(grid);
        
        if (Solvesudoku (grid)){
            System.out.println("le solution de Matrice Puzzle est :");
            System.out.println("--------------------");
        }
       
        else{
            System.out.println(" le solution de Matrice Puzzle est Impossible !!!");
            System.out.println("---------------------------------");
        }
        printSol(grid);
        }while(!Solvesudoku (grid));
        }
     

 


}
}
