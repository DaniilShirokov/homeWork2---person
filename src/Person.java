class Person {
    private String name;
    private String family;
    private Integer age;
    private SEX.Sex sex;
    private Education1.Education education;

    public Person(String name, String family, int age, SEX.Sex sex, Education1.Education education) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Integer getAge() {
        return age;
    }

    public SEX.Sex getSex() {
        return sex;
    }

    public Education1.Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", education=" + education +
                '}';
    }


}