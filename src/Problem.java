public class Problem {
    private int id;
    private String title;
    private String platform;
    private String difficulty;
    private String  status;

public Problem(
    String title,
    String platform,
    String difficulty,
    String status
)
{
    this.title = title;
    this.platform = platform;
    this.difficulty = difficulty;
    this.status = status;

}public String getTitle() {
    return title;
}

public String getPlatform() {
    return platform;
}

public String getDifficulty() {
    return difficulty;
}

public String getStatus() {
    return status;
}
}
