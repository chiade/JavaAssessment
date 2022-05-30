package com.generation.model;

public class Course
{
    private final String code;
    private final String name;
    private final int credits;
    private final Module module;

    public String id;

    public Course( String code, String name, int credits, Module module )
    {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.module = module;

    }
    public Course( String code, String name, int credits, Module module, String id)
    {   //create overloading to input id
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.module = module;
        this.id = id;
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public int getCredits()
    {
        return credits;
    }

    public Module getModule()
    {
        return module;
    }

    public String getId()
    {
        return id;
    } // add return id


    @Override
    public String toString()
    {
        return "Course{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", credits=" + credits + ", module="
            + module + '}';
    }
}
