import java.util.Scanner;
public class JourNaissance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //initialisation de matrice Set1
        int[][] bloc1 ={
            {1,3,5,7},
            {9,11,13,15},
            {17,19,21,23},
            {25,27,29,31}
        };
        //initialisation de matrice Set2
        int[][] bloc2 ={
            {2,3,6,7},
            {10,11,14,15},
            {18,19,22,23},
            {26,27,30,31}
        };
        //initialisation de matrice Set3
        int[][] bloc3 ={
            {4,5,6,7},
            {12,13,14,15},
            {20,21,22,23},
            {28,29,30,31}
        };
        //initialisation de matrice Set4
        int[][] bloc4 ={
            {8,9,10,11},
            {12,13,14,15},
            {24,25,26,27},
            {28,29,30,31}
        };
        //initialisation de matrice Set5
        int[][] bloc5 ={
            {16,17,18,19},
            {20,21,22,23},
            {24,25,26,27},
            {28,29,30,31}
        };
        // affichage du question si le jour existe dans la table  :
        System.out.println("le Jour de Naissance dans la bloc1 :");
        printSet(bloc1);
        // saisie du choix :
        System.out.print("0:non   1:oui ");
        String a = sc.nextLine();
        // affichage du question si le jour existe dans la table  :
        System.out.println("le Jour de Naissance dans la bloc2 :");
        printSet(bloc2);
     // saisie du choix :
        System.out.print("0:non   1:oui ");
        String b = sc.nextLine();
        // affichage du question si le jour existe dans la table  :
        System.out.println("le Jour de Naissance dans la bloc3 :");
        printSet(bloc3);
     // saisie du choix :
        System.out.print("0:non   1:oui ");
        String c = sc.nextLine();
        // affichage du question si le jour existe dans la table  :
        System.out.println("le Jour de Naissance dans la bloc4 :");
        printSet(bloc4);
     // saisie du choix :
        System.out.print("0:non   1:oui ");
        String d = sc.nextLine();
     // affichage du question si le jour existe dans la table  :
        System.out.println("le Jour de Naissance dans la bloc5 :");
        printSet(bloc5);
     // saisie du choix :
        System.out.print("0:non   1:oui ");
        String e = sc.nextLine();
        String r = e+d+c+b+a;
        // affichage du resultat :
        System.out.println("Ta Jour de Naissance est : " +binairyToInt(r) +);
    }
    //affichage de la matrice 
    private static void printSet(int[][] bloc1){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
               System.out.print(bloc1[i][j] + " ") ;
            }
            System.out.println();
         }
    }
    //convertir le mot du type string a un nombre et apres a un nombre decimal
    private static int binairyToInt(String r){
        int J=Integer.parseInt(r, 2);
        return J;
    }
 }