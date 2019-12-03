package in.co.javacoder.springormAssignment.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.co.javacoder.springormAssignment.passenger.dao.PassengerDao;
import in.co.javacoder.springormAssignment.passenger.dto.Passenger;

@Component("passenger")
public class PassengerDaoImpl implements PassengerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int save(Passenger passenger) {
		return (Integer) hibernateTemplate.save(passenger);
	}
	
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);;
	}

	@Transactional
	public void delete(Passenger passenger) {
		this.hibernateTemplate.delete(passenger);
	}

	@Transactional
	public Passenger get(int id) {
		return this.hibernateTemplate.get(Passenger.class, id);
	}

	@Transactional
	public List<Passenger> loadAll() {
		return this.hibernateTemplate.loadAll(Passenger.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
