
public class RelogioDecario {

	public String converte(String string) {
		if (string.equals("00000000")){
			return "0000000";
		}
		
		String centesimos = string.substring(6, 8);
		String segundos = string.substring(4, 6);
		String minutos = string.substring(2, 4);
		String horas = string.substring(0, 2);
		
		Integer minutosDecario = Integer.valueOf(horas) * 60+ (Integer.valueOf(minutos) * 60) + Integer.valueOf(segundos);
		return "00" + minutosDecario +  centesimos;		
		
		
	}
	
	

	
	
	
	

}
