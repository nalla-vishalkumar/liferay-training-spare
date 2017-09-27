package training.book.model;

public class Entry {

	private String trainingName;
	private String trainingDescription;

	public Entry(String trainingName, String trainingDescription) {
		super();
		this.trainingName = trainingName;
		this.trainingDescription = trainingDescription;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getTrainingDescription() {
		return trainingDescription;
	}

	public void setTrainingDescription(String trainingDescription) {
		this.trainingDescription = trainingDescription;
	}

}