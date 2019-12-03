package in.co.javacoder.springormAssignment.passenger.dao;

import java.util.List;

import in.co.javacoder.springormAssignment.passenger.dto.Passenger;

public interface PassengerDao {
	
	int save(Passenger passenger);
	void update(Passenger passenger);
	void delete(Passenger passenger);
	Passenger get(int id);
	List<Passenger> loadAll();

}
