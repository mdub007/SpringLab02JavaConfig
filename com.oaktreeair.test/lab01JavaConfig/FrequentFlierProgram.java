package lab01JavaConfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.oaktreeair.ffprogram.BonusCalc;
import com.oaktreeair.ffprogram.ContactInfo;
import com.oaktreeair.ffprogram.Flier;
import com.oaktreeair.ffprogram.Flier.Level;
import com.oaktreeair.ffprogram.Segment;

public class FrequentFlierProgram {
	
	public static void main(String args[]){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(FrequentFlierConfig.class);
		Flier flier = (Flier)ctx.getBean("getFlier");
		
		System.out.println(flier.getFlierName());
		System.out.println(flier.getFlierID());
		ContactInfo contactInfo = flier.getContactInformation();
		System.out.println(contactInfo.getEmailAddress());
	    flier.setLevel(Level.Gold);
	    Segment seg = (Segment)ctx.getBean(Segment.class);
	    BonusCalc bonusCalc = (BonusCalc)ctx.getBean(BonusCalc.class);
	    int bonus = bonusCalc.calcBonus(flier, seg);
	    System.out.println(bonus);
	    ctx.close();
	}

}
