package com.epam3.CleanCode_Serialization;

public class ConstructionCost {
      int costUsingStandardMaterials(int area) {
    	  return 1200*area;
      }
      int costUsingAboveStandardMaterials(int area) {
    	  return 1500*area;
      }
      int costUsingHightStandardMaterials(int area) {
    	  return 1800*area;
      }
      int costUsingHighStandardMaterialsandFullyAutomated(int area) {
    	  return 2500*area;
      }
}
