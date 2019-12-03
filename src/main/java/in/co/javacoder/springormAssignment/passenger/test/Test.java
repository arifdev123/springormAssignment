package in.co.javacoder.springormAssignment.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.co.javacoder.springormAssignment.passenger.dao.PassengerDao;
import in.co.javacoder.springormAssignment.passenger.dto.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"in/co/javacoder/springormAssignment/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("passenger");
		System.out.println(passengerDao.loadAll());
		
		/*
		 * Passenger passenger = new Passenger(); passenger.setId(5);
		 * passenger.setFirstName("Mohamed"); passenger.setLastName("Isaa");
		 */
		
		//System.out.println(passengerDao.save(passenger));
		//System.out.println(passengerDao.loadAll());
		
		//passengerDao.update(passenger);
		//passengerDao.delete(passenger);
		//System.out.println(passengerDao.loadAll());
		
		System.out.println(passengerDao.get(1));
	}

}
