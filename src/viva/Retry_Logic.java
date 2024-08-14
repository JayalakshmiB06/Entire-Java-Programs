package viva;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer
{
    int initial_count = 0, retry_limit = 3 ;
	@Override
	public boolean retry(ITestResult result)
	{
	    if(initial_count < retry_limit)
	    {
	    	initial_count++;
	    	return true;
	    }
		return false;
	}

}
