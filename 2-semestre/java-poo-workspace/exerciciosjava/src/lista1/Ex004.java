package lista1;
import java.util.Scanner;
public class Ex004 {

	public static void main(String[] args) {
		/* 4) Faça um programa em Java que receba as horas de início e fim de uma atividade (expressas em horas,
minutos e segundos) e ao final informe o tempo de duração da atividade. Dica: transforme as horas de início
e fim em segundos, realize a subtração e em seguida volte a transformar em horas, minutos e segundos. */

		Scanner sc=new Scanner(System.in);
		int hi, mi, si, hf, mf, sf;
		int hd, md, sd, ti, tf, dt;
		hi=sc.nextInt();
		mi=sc.nextInt();
		si=sc.nextInt();
		hf=sc.nextInt();
		mf=sc.nextInt();
		sf=sc.nextInt();
		ti=(hi*3600)+(mi*60)+si;
		tf=(hf*3600)+(mf*60)+sf;
		dt=tf-ti;
		hd=dt/3600;
		dt=dt%3600;
		md=dt/60;
		sd=dt%60;
		System.out.println("Tempo total: "+hd+":"+md+":"+sd);
		
		
		
	}

}
