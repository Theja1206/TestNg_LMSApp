package api.endpoints;

public class Routes {
	public static String base_url="https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms";
	public static String post_url=base_url+"/batches";

	public static String getAll_url=base_url+"/batches";

	public static String update_url=base_url+"/batches/{batchId}";

	public static String delete_url=base_url+"/batches/{id}";

	public static String getById_url=base_url+"/batches/batchId/{batchId}";

	public static String getByName_url=base_url+"/batches/batchName/{batchName}";

	public static String getByProgram_url=base_url+"/batches/program/{programId}";
		
}
