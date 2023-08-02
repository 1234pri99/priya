package com.priya.App;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerLayer {
@Autowired
PrimarySer primaryser;
@GetMapping("/primarydata2")
public List<PrimaryData2> getre()
{
	return primaryser.getPrimaryDBResponse();
	}
}
