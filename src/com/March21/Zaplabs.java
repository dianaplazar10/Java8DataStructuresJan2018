/**
 * Given objects that implement these interfaces:
 */
public interface Realtor {
  String getOffice();
  String getRegion();
  String getName();
  
  Long getAnnualEarnings();
  
  String toString(); // Prints “{name} ${annualEarnings}”
}

public interface RealtorDataService {
  /**
   * @return The list of offices we have data for a given year.
   */
  List<String> getOffices(int year);

  /**
   * @return The list of Realtors that we have data for a given Office and year.
   *         throw an exception if the event for the year does not exist.
   */
  List<Realtor> getOfficeData(int year, String office);
}

/**
 * For each Region, print the top k performing Realtors that have 
 * earned at least $1000. 
 * 
 * The Regions should be printed in natural ordering.
 * The Realtors should be ranked in order of annual earnings, highest to lowest.
 */
public void printTopPerformingRealtors(RealtorDataService service, int year, int k) {
//For each Region, print the top k performing Realtors that have 
 //earned at least $1000.
 List<String> offices =(List<String>) service.getOffices(year);
 Map(String,Collection<Realtor>) reg_real = new TreeMap(String, Collection<Realtor>)();
	for(String office : offices) {
  	List<Realtor> realtorsPerOffice = service.getOfficeData(year,office));
    
    for (Realtor realtor:  realtorsPerOffice) {
    	if (realtor.getAnnualEarnings() > 1000) {
        reg_real.put(realtor.getRegaion(), realtor.getOrDefault(new TreeSet((x,y) -> x.getgetAnnualEarnings().)))	
      }
    }
  }
 
 for (Map.Entry<String, List<Realtor>> entry : reg_real.entrySet()) {
 	System.out.println(entry.getKey());	
  for (Realtor r : takeK(entry.getValue(), k)) {
  	System.out.println(r);
  }
 }
}

service.getOffices(year).stream()
.map(x -> service.getOfficeData(x, year))
.flatMap(List::stream)
.filter(x -> x.getAnnualEarnings() > 1000)
.collect(TreeMap::new, (c,x) ->{c.put(x.getRegion(), c.getOrDefault(, new TreeSet(...)	}, (c1, c2) ->{...} )
.entrySet()
.stream().forEach(x -> {System.out.println(x.getKey());	x.getValue().stream().limit(k).forEach(System.out::println)})

Example output: 

Bay Area
John Smith 	$50000

Los Angeles Metro
Jane Smith    $50000
Joe Jones	   $45000    

San Diego Metro
Derek Jones	$20000