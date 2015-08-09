package br.com.exercicio5;

public class Main03 {

	public static int contadorTheards = 0;
	private final Object LOCK = new Object();

	public static void main(String[] s) {
		try {
			System.out.println("Iniciando Execução de Theads.");
			new Main03().executa();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public void executa() {
		synchronized (LOCK) {
			while (true)
				try {
					Threads1 ts1 = new Threads1();
					Thread t1 = new Thread(ts1);

					Threads2 ts2 = new Threads2();
					Thread t2 = new Thread(ts2);
					contadorTheards++;

					LOCK.wait(5000);
					System.out.println("Estado Thead 1" + t1.getState().name());
					System.out.println("Estado Thead 2" + t2.getState().name());
					LOCK.wait(5000);
					System.out.println("Estado Thead 1" + t1.getState().name());
					System.out.println("Estado Thead 2" + t2.getState().name());
					LOCK.wait(5000);
					System.out.println("Estado Thead 1" + t1.getState().name());
					System.out.println("Estado Thead 2" + t2.getState().name());
					LOCK.wait(5000);
					System.out.println("Estado Thead 1" + t1.getState().name());
					System.out.println("Estado Thead 2" + t2.getState().name());

					t1.start();
					if (contadorTheards == 10) {
						t2.start();
						contadorTheards = 0;
					}
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
		}
	}
}