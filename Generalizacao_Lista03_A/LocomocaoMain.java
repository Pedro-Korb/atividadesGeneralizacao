
public class LocomocaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caminhao truck = new Caminhao();
		Carro car = new Carro();
		Moto motorcycle = new Moto();
		Veiculo vehicle = new Veiculo();
		
		
		truck.setEixos(9);
		truck.setMotor(true);
		
		car.setNumero_portas(4);
		car.setMotor(true);
		
		motorcycle.setCilindradas(500);
		motorcycle.setMotor(true);
		
		vehicle.setMotor(true);
		
		System.out.println(truck);
		System.out.println(car);
		System.out.println(motorcycle);
		System.out.println(vehicle);
		
	}

}
