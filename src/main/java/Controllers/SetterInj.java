package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Pojos.Answer;
import Pojos.Question;
import Pojos.User;

@Controller
public class SetterInj {
	/*@Autowired
	Student s1;
	@Autowired
	Passport p1;
	@Autowired
	Student s2;
	@Autowired
	Passport p2;

	@RequestMapping(value = "setterInjectionController")
	public String setterInjDetails(Model model) {
		System.out.println("Entered into Setter IOC and Has-a Scope Test Controller");
		s1.setsId(1);
		s1.setsName("aaa");
		p1.setpId(1111);
		s1.setPassport(p1);

		s2.setsId(2);
		s2.setsName("bbb");
		p2.setpId(2222);
		s2.setPassport(p2);

		System.out.println(s1.getsId() + "====" + s1.getsName() + "====" + s1.getsCollege());
		System.out.println(s1.getPassport().getpId() + "====" + s1.getPassport().getpLocation());
		System.out.println(s2.getsId() + "====" + s2.getsName() + "====" + s2.getsCollege());
		System.out.println(s2.getPassport().getpId() + "====" + s2.getPassport().getpLocation());
		return "Setter";
	}*/
	
	@Autowired
	Answer a;
	@Autowired
	User u;
	@Autowired
	Question q;
	@RequestMapping(value = "setterInjectionController")
	public String setterInjDetails() {
		System.out.println("Entered into Setter Injection with Non-String Map (having dependent Object) Test Controller");
		a.setId(0);
		a.setAnswer("Java is a Loco");
		a.setPostedDate("17/03/2018");
		u.setId(0);
		u.setName("u1");
		u.setEmail("user1@user1.com");
		q.setId(0);
		System.out.println(q);
		System.out.println(u.getEmail() + " ========== " + u.getName());

		a.setId(1);
		a.setAnswer("Java is a YOYO");
		a.setPostedDate("18/04/2019");
		u.setId(1);
		u.setName("u2");
		u.setEmail("user2@user2.com");
		q.setId(1);
		System.out.println(q);
		System.out.println(u.getEmail() + " ========== " + u.getName());
		return "Setter";
	}
	
}