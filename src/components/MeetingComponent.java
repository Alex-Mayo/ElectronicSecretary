/*
 Ileigh Aube, Alexander Mayo, Espen Wold
 CSI 340 Final Project: Electronic Secretary
 */

package components;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class MeetingComponent extends ReminderComponent{
    protected List<String> people;

    public MeetingComponent(String title, String description, List<String> people, LocalDate date, LocalTime time){
        super(title, description, date, time);
        this.people = people;
    }

    
    public String compose(){
        //Figure out how to compose here
        String output = super.compose();
        output += "People: ";
        for(int i = 0; i < this.people.size(); i++){
            output += this.people.get(i);
            if(i + 1 < this.people.size()){
                output += ", ";
            }
            else{
                output += "\n";
            }
        }
        return output;
    }
    
}
