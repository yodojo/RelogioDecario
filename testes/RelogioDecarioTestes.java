import junit.framework.Assert;

import org.junit.Test;


public class RelogioDecarioTestes {
	
	
	
	@Test
	public void ConverteCentesimoBase10( ){
		RelogioDecario relogio = new RelogioDecario();
		
		Assert.assertEquals("0000000", relogio.converte("00000000"));
	}

	
	public void verSeHoraEquivale()
	{
		
		RelogioDecario relogio = new RelogioDecario();
		Assert.assertEquals("5000000",relogio.converteHora("12000000"));
	}
	

}
