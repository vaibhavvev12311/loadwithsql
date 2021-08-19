package com.springload.springload.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springload.springload.dao.LoadDao;
import com.springload.springload.entities.Load;

@Service
public class LoadServiceImp implements LoadService{
	@Autowired
	private LoadDao loadDao;
	
//	List<Load>list;
	
	public LoadServiceImp() {
		
//		list=new ArrayList<>();
//		list.add(new Load(100,"mumbai","bhopal","hard","container",5,500,"nothing",17082021));
//		list.add(new Load(102,"goa","bhopal","hard","container",50,5000,"nothing",17082021));
//		
	}

	@Override
	public List<Load> getLoad() {
		
		return loadDao.findAll();
	}

	@Override
	public Load getLoad(long loadsId) {


//		Load l =null;
//		
//		for(Load load: list)
//		{
//			if (load.getId()==loadsId) {
//				l=load;
//				break;
//			}
//		}
		return loadDao.getById(loadsId);
	}

	@Override
	public Load addLoad(Load load) {
//		list.add(load);
		loadDao.save(load);
		return load;
	}

	@Override
	public Load updateLoad(Load load) {


//		list.forEach(e->{
//			if (e.getId()==load.getId()) {
//				e.setLoadingPoint(load.getLoadingPoint());
//				e.setUnloadingPoint(load.getUnloadingPoint());
//				e.setProductType(load.getProductType());
//				e.setTruckType(load.getTruckType());
//				e.setNoOfTruck(load.getNoOfTruck());
//				e.setWeight(load.getWeight());
//				e.setComment(load.getComment());
//				e.setDate(load.getDate());
//			}
//		});
		loadDao.save(load);
		return load;
	}

	@Override
	public void deleteLoad(long loadsId) {
//		list.stream().filter(load->{
//			if (load.getId()!=loadsId) {
//				return true;
//			}else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		Load entity = loadDao.getById(loadsId);
		loadDao.delete(entity);
	}


	}


