package rm.web.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rm.web.main.mapper.MainMapper;
import rm.web.main.service.MainService;

@Service
public class MainServiceImpl implements MainService {
	
	@Autowired MainMapper mainMapper;
	
	@Override
	public void userSearch() {
		mainMapper.userSearch();
	}
}
