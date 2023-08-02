package com.priya.App;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrimarySer {
@Autowired
Repos repos;
public List<PrimaryData2> getPrimaryDBResponse()
{
	List<PrimaryData2> loi=repos.findAll();
	return loi;
	}
}
