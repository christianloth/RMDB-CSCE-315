

public class Config {

    public String[] query_tables = {"conferences", "Conference Season", "Drives",
                            "Games", "Kickoff Returns", "Kickoffs", "Passes",
                            "Player", "Player Game Statistics", "Player Season",
                            "Plays", "Punts Returned", "Punts", "Receptions", "Rushes",
                            "Stadium", "Stadium Season", "Subdivision", "Teams",
                            "Team Game Statistics"};



    public String search_title = "Search";
    public String frame_title = "NCAA Query";
    public static String default_table_label = "Select Table";

    public static String image_directory = System.getProperty("user.dir") + "\\315Logo.png"; // getting the current directory


}
