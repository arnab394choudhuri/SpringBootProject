//package com.lti.repo;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.lti.entity.Flight;
//
//public interface FlightRepository extends JpaRepository<Flight , Integer>{
//	
//	@Query("FROM Flight WHERE carrier=:car")
//	List<Flight> findByCarrier(@Param("car") String car);
//	
//	@Query("FROM Flight WHERE source=:src AND destiny=:dst")
//	List<Flight> findByRoute(@Param("src") String src, @Param("dst") String dst);
//}