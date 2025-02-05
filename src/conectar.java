//package main;
//
//import java.math.BigDecimal;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//Scanner scanner = new Scanner(System.in);
//string USER = "";
//public class conectar {
//
//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//        System.out.println("Digite seu usuário:");
//        String USER = scanner.nextLine();
//      
//        System.out.println("Digite a senha:");
//        String PASSWORD = scanner.nextLine();
//        
//        static String URL = "jdbc:mysql://localhost:3306/projsenai";
//}
//		
//	public static Connection conexao_com_banco() {
//			try {
//				return DriverManager.getConnection(URL, USER, PASSWORD);
//				}
//			catch (SQLException e){
//				System.err.println("ERRO, QUEBROU TUDO :c " + e.getMessage());			
//				return null;	
//				}
//			}
//	
//	}
//}
