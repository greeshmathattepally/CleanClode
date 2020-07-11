package com.epam3.CleanCode_Serialization;

public class Interest {
	double calculateSimpleInterest(int prinicipalAmount,int timeInYears,double rateOfInterest)
	{
		return (int)(prinicipalAmount*timeInYears*rateOfInterest)/(100);
	}
	double calculateCompoundInterest(int prinicipalAmount,int timeInYears,double rateOfInterest)
	{
		return (prinicipalAmount* (Math.pow( (1+(rateOfInterest/100)) ,timeInYears)) );
	}
}
