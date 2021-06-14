package structural.composite;

import structural.composite.employee.JuniorEmployee;
import structural.composite.employee.Leader;
import structural.composite.employee.MiddleEmployee;
import structural.composite.employee.SeniorEmployee;

public class Client {

    public static void main(String[] args) {

        Department itDepartment = new Department(
                new Leader("Soler", 1_000_000,
                        new Leader("Mike", 650_000,
                                new Leader("Uik", 320_000,
                                        new SeniorEmployee("ABC", 250_000),
                                        new MiddleEmployee("Jery", 150_000)
                                ),
                                new SeniorEmployee("Munhausen", 230_000),
                                new SeniorEmployee("Barny", 240_000),
                                new JuniorEmployee("Number One", 50_000)
                        ),
                        new Leader("John", 550_000,
                                new Leader("Mr Static", 300_000,
                                        new Leader("Pikachu", 250_000,
                                                new SeniorEmployee("Amstrong", 210_000)
                                        ),
                                        new JuniorEmployee("Fifty fifty", 80_000),
                                        new JuniorEmployee("Andy", 40_000)
                                ),
                                new Leader("Tesla boy", 330_000,
                                        new MiddleEmployee("Alakazam", 140_000),
                                        new JuniorEmployee("Abraham", 60_000)
                                ),
                                new Leader("Martin", 270_000,
                                        new Leader("Serious Sam", 200_000,
                                                new SeniorEmployee("Anna", 200_000),
                                                new SeniorEmployee("Mary", 210_000),
                                                new JuniorEmployee("Peter", 80_000)
                                        ),
                                        new MiddleEmployee("Ted", 170_000),
                                        new MiddleEmployee("Oooooohhh myyyyyyy", 150_000),
                                        new MiddleEmployee("Nachtmahr", 130_000),
                                        new JuniorEmployee("Bredly", 70_000)
                                ),
                                new SeniorEmployee("Wolferine", 220_000),
                                new MiddleEmployee("Super bizon", 170_000)
                        ),
                        new Leader("Fred", 570_000,
                                new Leader("Abra", 280_000,
                                        new JuniorEmployee("Junior 1", 40_000),
                                        new JuniorEmployee("Junior 2", 50_000),
                                        new JuniorEmployee("Junior 3", 60_000),
                                        new JuniorEmployee("Junior 4", 30_000),
                                        new JuniorEmployee("Junior 5", 40_000)
                                ),
                                new Leader("Cadabra", 360_000,
                                        new Leader("Vinny", 210_000,
                                                new MiddleEmployee("Lily", 160_000),
                                                new JuniorEmployee("Gundir", 50_000)
                                        ),
                                        new SeniorEmployee("Tom", 200_000),
                                        new MiddleEmployee("Slipknot", 140_000)
                                ),
                                new JuniorEmployee("Olga", 60_000)
                        )

                )
        );

        System.out.println("Work day started...\n");
        itDepartment.startWorkDay();
        System.out.println("\nIT department summarize salary = " + itDepartment.getDepartmentSalary());
    }
}