package com.model;

import org.springframework.batch.item.ItemProcessor;

public class CustomeItemProcessor implements ItemProcessor<Report, Report>{

	@Override
	public Report process(Report item) throws Exception {
		System.out.println("Processing..."+ item);
		return item;
	}

}
