package com.hospital.project.repositry;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hospital.project.entiries.BedMaster;
@Repository
public interface BedReprository extends JpaRepository<BedMaster, Integer>{

	@Query("select l  from BedMaster l where status='avaliable'")
	public List<BedMaster> BedAvaliable();
	
	@Query("select l  from BedMaster l where status='booked'")
	public List<BedMaster> BedBooked();
}
