package org.javacream.training.android.people;


import org.javacream.training.android.MainActivity;
import org.javacream.training.android.people.controller.CreatePersonController;
import org.javacream.training.android.people.model.PeopleModel;

public class PeopleAppContext {

    private static CreatePersonController createPersonController;
    private static PeopleModel peopleModel;

    public static void init(MainActivity mainActivity){
        peopleModel = new PeopleModel();
        createPersonController = new CreatePersonController();
        createPersonController.setPeopleModel(peopleModel);
        createPersonController.setMainActivity(mainActivity);
    }

    public static CreatePersonController createPersonController(){
        return createPersonController;
    }

}