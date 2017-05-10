package lab01JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.oaktreeair.ffprogram.BonusCalc;
import com.oaktreeair.ffprogram.BonusCalcImpl;
import com.oaktreeair.ffprogram.ContactInfo;
import com.oaktreeair.ffprogram.Flier;
import com.oaktreeair.ffprogram.Flier.Level;
import com.oaktreeair.ffprogram.Segment;

@Configuration
public class FrequentFlierConfig {

	@Bean
	public Segment getSegment(){
		Segment seg = new Segment();
		seg.setFlightNumber(2238);
		seg.setMiles(1000);
		seg.setOriginatingCity("ORD");
		seg.setSegmentNumber(1234L);
		return seg;
	}
	
	@Bean
	public ContactInfo getContactInfo(){
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setEmailAddress("nitish.dubey@ymail.com");
		contactInfo.setHomePhone("612-244-0020");
		contactInfo.setMobilePhone("612-244-0020");
		contactInfo.setSmsNumber("612-244-0020");
		return contactInfo;
	}
	@Bean
	public BonusCalc getCalcBonus(){
	return new BonusCalcImpl();
	}
	
	@Bean
	public Flier getFlier(){
		Flier flier = new Flier();
		flier.setContactInformation(getContactInfo());
		flier.setFlierID(1234l);
		flier.setFlierName("Nitish");
		flier.setLevel(Level.Gold);
		flier.addSegment(getSegment());
		return flier;
	}
}
