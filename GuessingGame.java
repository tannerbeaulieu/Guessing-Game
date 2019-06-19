// Name : Tanner Beaulieu
// Class : CIST1400-502
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : Program 03 Reference Sheet

// The purpose of this program is to calculate various text-leveling metrics of a  
// document based on some of its characeristics


import java.util.Scanner;

public class GuessingGame
{
   public static void main(String[] args)
   
   {
      
      
      System.out.println("Think of something and I'll try to guess what you're thinking of. \nIs it a living animal, living plant, or non-living thing?");
      Scanner input = new Scanner(System.in);
      String prompt = input.nextLine().toLowerCase();
      switch (prompt)
      {
         case "living animal": 
            System.out.println("Does it have feathers, fur, or neither?");
            prompt = input.nextLine().toLowerCase();
            switch(prompt)
            {
               case "feathers":
                  System.out.println("Is it bigger than a soccer ball?");
                  prompt = input.nextLine().toLowerCase();
                  switch(prompt)
                  
                  {
                     case "yes": //yes bigger than soccer ball
                        System.out.println("Does it fly?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes fly
                              System.out.println("Does it hunt prey?");
                              prompt = input.nextLine().toLowerCase();
                              
                              switch(prompt)
                              {
                                
                                 case "yes": //yes hunts
                                    System.out.println("Is it an osprey?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes osprey
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                          
                                       
                                       case "no": //no osprey
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                        
                                       default: //invalid osprey
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no hunts
                                    System.out.println("Is it a crested caracaras?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                        
                                       case "yes": //yes crested
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                       case "no": //no crested
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                       default: //invalid crested
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                    }     
                                    break;
                                 default: //invalid prey 
                                    System.out.println("Invalid response");
                                    break;
                              }   
                              break;
                           case "no": //no fly
                              System.out.println("Does it swim?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes swims
                                    System.out.println("Is it an emperor penguin?"); 
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes penguin
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no penguin
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid penguin
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no swims
                                    System.out.println("Is it an emu?");
                                    prompt= input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes emu
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no emu
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid emu
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid swims
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }    
                              break;
                           
                           default: //invalid fly
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     case "no": //no soccer ball
                        System.out.println("Does it eat meat?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes meat
                              System.out.println("Does it hunt at night?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes hunts
                                    System.out.println("Is it an owl?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes owl
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no owl
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid owl
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no hunts
                                    System.out.println("Is it a falcon?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes falcon
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no falcon
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid falcon
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid hunts
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                              break;
                           case "no": //no meat
                              System.out.println("Is it yellow?");
                              prompt = input.nextLine().toLowerCase();
                              switch (prompt)
                              {
                                 case "yes": //yes yellow
                                    System.out.println("Is it a pine siskin?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes pine siskin
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no pine siskin
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid siskin
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no yellow
                                    System.out.println("Is it a blue jay?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes blue jay
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no blue jay
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid blue jay
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid yellow
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                           default: //invalid meat
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     
                     default: //invalid soccer ball 
                        System.out.println("Invalid response.");
                        System.out.println("You should try again!");
                  }
                  break;      
                   
                        
                  case "fur": // yes fur
                  System.out.println("Is it domesticated?");
                  prompt = input.nextLine().toLowerCase();
                  switch(prompt)
                  
                  {
                     case "yes": //yes domesticated
                        System.out.println("Is it bigger than a chair?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes bigger than chair
                              System.out.println("Can you ride it?");
                              prompt = input.nextLine().toLowerCase();
                              
                              switch(prompt)
                              {
                                
                                 case "yes": //yes ride
                                    System.out.println("Is it a camel?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes camel
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                          
                                       
                                       case "no": //no camel
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                        
                                       default: //invalid camel
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no ride
                                    System.out.println("Is it a cow?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                        
                                       case "yes": //yes cow
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                       case "no": //no cow
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                       default: //invalid cow
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                    }     
                                    break;
                                 default: //invalid ride
                                    System.out.println("Invalid response");
                                    break;
                              }   
                              break;
                           case "no": //no chair
                              System.out.println("Does it bark?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes barks
                                    System.out.println("Is it a dog?"); 
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes dog
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no dog
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid dog
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no barks
                                    System.out.println("Is it a ferret?");
                                    prompt= input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes ferret
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no ferret
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid ferret
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid barks
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }    
                              break;
                           
                           default: //invalid ride
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     case "no": //no domesticated
                        System.out.println("Does it eat meat?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes meat
                              System.out.println("Does it hibernate?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes hibernates
                                    System.out.println("Is it a bear?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes bear
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no bear
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid bear
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no hibernates
                                    System.out.println("Is it a lion?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes lion
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no lion
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid lion
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid hibernates
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                              break;
                           case "no": //no meat
                              System.out.println("Does it have stripes?");
                              prompt = input.nextLine().toLowerCase();
                              switch (prompt)
                              {
                                 case "yes": //yes stripes
                                    System.out.println("Is it a chipmunk?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes chipmunk
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no chipmunk
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid chipmunk
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no stripes
                                    System.out.println("Is it an antelope");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes antelope
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no antelope
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid antelope
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid stripes
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                           default: //invalid meat
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     
                     default: //invalid domesticated
                        System.out.println("Invalid response.");
                        System.out.println("You should try again!");
                     }
                     break;
                     
                  case "neither": //neither fur nor feathers
                  System.out.println("Does it swim?");
                  prompt = input.nextLine().toLowerCase();
                  switch(prompt)
                  
                  {
                     case "yes": //yes swims
                        System.out.println("Is it a mammal?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes mammal
                              System.out.println("Is it bigger than a car?");
                              prompt = input.nextLine().toLowerCase();
                              
                              switch(prompt)
                              {
                                
                                 case "yes": //yes car
                                    System.out.println("Is it a whale?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes whale
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                          
                                       
                                       case "no": //no whale
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                        
                                       default: //invalid whale
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no car
                                    System.out.println("Is it a dolphin?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                        
                                       case "yes": //yes dolphin
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                       case "no": //no dolphin
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                       default: //invalid dolphin
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                    }     
                                    break;
                                 default: //invalid car
                                    System.out.println("Invalid response");
                                    break;
                              }   
                              break;
                           case "no": //no mammal
                              System.out.println("Does it eat meat?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes meat
                                    System.out.println("Is it a shark?"); 
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes shark
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no shark
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid shark
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no meat
                                    System.out.println("Is it a clownfish?");
                                    prompt= input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes clownfish
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no clownfish
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid clownfish
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid meat
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }    
                              break;
                           
                           default: //invalid mammal
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     case "no": //no swim
                        System.out.println("Does it have legs?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes legs
                              System.out.println("Is it bigger than a soccer ball?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes soccer ball
                                    System.out.println("Is it a komodo dragon?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes dragon
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no dragon
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid dragon
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no soccer ball
                                    System.out.println("Is it a chameleon?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes chameleon
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no chameleon
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid chameleon
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid soccer ball
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                              break;
                           case "no": //no legs
                              System.out.println("Is it venemous?");
                              prompt = input.nextLine().toLowerCase();
                              switch (prompt)
                              {
                                 case "yes": //yes venemous
                                    System.out.println("Is it a rattlesnake?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes rattlesnake
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no rattlesnake
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid rattlesnake
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no venemous
                                    System.out.println("Is it a rat snake?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes rat snake
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no rat snake
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid rat snake
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid venemous
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                              break;
                           default: //invalid legs
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                     
                     
                     default: //invalid swim
                        System.out.println("Invalid response.");
                        System.out.println("You should try again!");
                     }  
                     
                     break;
               
        case "living plant": //living plant
               System.out.println("Is it a tree?");
            prompt = input.nextLine().toLowerCase();
            switch(prompt)
            {
               case "yes":
                  System.out.println("Is it deciduous?");
                  prompt = input.nextLine().toLowerCase();
                  switch(prompt)
                  
                  {
                     case "yes": //yes deciduous
                        System.out.println("Is it a fruit tree?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes fruit tree
                              System.out.println("Does it have orange fruit?");
                              prompt = input.nextLine().toLowerCase();
                              
                              switch(prompt)
                              {
                                
                                 case "yes": //yes orange
                                    System.out.println("Is it a tangerine tree?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes tangerine
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                          
                                       
                                       case "no": //no tangerine
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                        
                                       default: //invalid tangerine
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no orange
                                    System.out.println("Is it a banana tree?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                        
                                       case "yes": //yes banana
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                       case "no": //no banana
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                       default: //invalid banana
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                    }     
                                    break;
                                 default: //invalid banana
                                    System.out.println("Invalid response");
                                    break;
                              }   
                              break;
                           case "no": //no fruit tree
                              System.out.println("Is it a weeping tree?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes weeping
                                    System.out.println("Is it a weeping alaska cedar tree?"); 
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes weep cedar
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no weep cedar
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid weep cedar
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no weeps
                                    System.out.println("Is it a maple tree?");
                                    prompt= input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes mape
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no maple
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid maple
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid maple
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }    
                              break;
                           
                           default: //invalid fruit
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     case "no": //no deciduous
                        System.out.println("Is it native to N. America?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes native
                              System.out.println("Does it produce cones?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes cones
                                    System.out.println("Is it a spruce tree?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes spruce
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no spruce
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid spruce
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no cones
                                    System.out.println("Is it a flowering dogwood tree?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes flowering dog
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no flowering dog
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid flowering dog
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid cones
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                              break;
                           case "no": //no native
                              System.out.println("Does it have an enclosed seed?");
                              prompt = input.nextLine().toLowerCase();
                              switch (prompt)
                              {
                                 case "yes": //yes enclosed
                                    System.out.println("Is it a cypress tree?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes cypress
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no cypress
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid cypress
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no enclosed
                                    System.out.println("Is it a yew?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes yew
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no yew
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid yew
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid enclosed
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                           default: //invalid native
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     
                     default: //invalid deciduous
                        System.out.println("Invalid response.");
                        System.out.println("You should try again!");
                  }
                  break;      
                        
                  case "no": // no tree
                  System.out.println("Does it have flowers?");
                  prompt = input.nextLine().toLowerCase();
                  switch(prompt)
                  
                  {
                     case "yes": //yes flowers
                        System.out.println("Is it a fruit?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes fruit
                              System.out.println("Is it round?");
                              prompt = input.nextLine().toLowerCase();
                              
                              switch(prompt)
                              {
                                
                                 case "yes": //yes round
                                    System.out.println("Is it a tomato plant?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes tomato
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                          
                                       
                                       case "no": //no tomato
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                        
                                       default: //invalid tomato
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no round
                                    System.out.println("Is it a squash plant?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                        
                                       case "yes": //yes squash
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                       case "no": //no squash
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                       default: //invalid squash
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                    }     
                                    break;
                                 default: //invalid round
                                    System.out.println("Invalid response");
                                    break;
                              }   
                              break;
                           case "no": //no fruit
                              System.out.println("Does it have thorns?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes thorns
                                    System.out.println("Is it a rose bush?"); 
                                    prompt = input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes rose
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no rose
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid rose
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no thorns
                                    System.out.println("Is it a lily plant?");
                                    prompt= input.nextLine().toLowerCase();
                                    switch(prompt)
                                    {
                                       case "yes": //yes lily
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no lily
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid lily
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid thorns
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }    
                              break;
                           
                           default: //invalid fruit
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     case "no": //no flowers
                        System.out.println("Is it a vegetable?");
                        prompt = input.nextLine().toLowerCase();
                        switch(prompt)
                        {
                           case "yes": //yes vegetable
                              System.out.println("Is it orange?");
                              prompt = input.nextLine().toLowerCase();
                              switch(prompt)
                              {
                                 case "yes": //yes orange
                                    System.out.println("Is it a carrot plant?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes carrot
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no carrot
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid carrot
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no orange
                                    System.out.println("Is it a potato plant?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                       case "yes": //yes potato
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       case "no": //no potato
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid potato
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid orange
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                              break;
                           case "no": //no vegetable
                              System.out.println("Does it have leaves?");
                              prompt = input.nextLine().toLowerCase();
                              switch (prompt)
                              {
                                 case "yes": //yes leaves
                                    System.out.println("Is it a boxwood bush?");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes boxwood
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no boxwood
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid boxwood
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 case "no": //no leaves
                                    System.out.println("Is it grass");
                                    prompt = input.nextLine().toLowerCase();
                                    switch (prompt)
                                    {
                                             
                                    
                                       case "yes": //yes grass
                                          System.out.println("I am correct!");
                                          System.out.println("You should try again!");
                                          break;
                                             
                                       case "no": //no grass
                                          System.out.println("Oh, I am wrong!");
                                          System.out.println("You should try again!");
                                          break;
                                    
                                       default: //invalid grass
                                          System.out.println("Invalid response.");
                                          System.out.println("You should try again!");
                                          break;
                                    }
                                    break;
                                 default: //invalid leaves
                                    System.out.println("Invalid response.");
                                    System.out.println("You should try again!");
                                    break;
                              }
                           default: //invalid vegetable
                              System.out.println("Invalid response.");
                              System.out.println("You should try again!");
                              break;
                        }
                        break;
                     
                     default: //invalid flower
                        System.out.println("Invalid response.");
                        System.out.println("You should try again!");
                     }
                     break;
                  default: //invalid tree
                  System.out.println("Invalid response.");
                  System.out.println("You should try again!");
            
                }
            }
      }
     
   }
}         
      
      
      
      
      
   

   
