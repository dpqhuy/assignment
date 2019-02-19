
# assignment

**A.** 
**1. Can you implement the sing() method for the bird?
  a. How did you unit test it?**
	  *For each class, i will create the approriate test class, due to all the class method using System.out, i created the baseTest and setup outContent to hold the value of System.out, then every test class will inherited from BaseTest, and we can compare outContent variable with expected value*
  **b. How did you optimize the code for maintainability?**
  Insead of using class, I create animal interface (IAnimal, IBird) and action interface (ICanSwim, ICanWalk, ISay...)

**2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?**
**a. A duck says: “Quack, quack”**
Override the say method of interface ISay
**b. A duck can swim**
Duck class implements interface ICanSwim
**c. A chicken says: “Cluck, cluck”**
Override the say method of interface ISay
d. A chicken cannot fly (assumption: its wings are clipped but ignore that)**
so Chicken will not implements ICanFly interface

**3. Now how would you model a rooster?**
**a. A rooster says: “Cock-a-doodle-doo”
b. How is the rooster related to the chicken?
c. Can you think of other ways to model a rooster without using inheritance?**
Rooster is the specific type of chicken, so i decide to let Rooster inherit Chicken
Beside inheriance, we can model the Rooster to implements the approriate interfaces
**4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?**
I declare one propery in Parrot class which is the implementation of ISay interface,
i allow only the constructor with ISay argument, then in say method, i will call say method of the property ISay

**B. Model fish as well as other swimming animals**
**1. In addition to the birds, can you model a fish?
a. Fishes don’t sing
b. Fishes don’t walk
c. Fishes can swim**
Create Fish class implements ICanSwim

**2. Can you specialize the fish as a Shark and as a Clownfish?
a. Sharks are large and grey
b. Clownfish are small and colourful (orange)
c. Clownfish make jokes
d. Sharks eat other fish**

Add 3 properties to Fish class which are size, color, detail 
Add constructor accept 3 argument size, color, detail
Create Shark class extends Fish.
Shark class has a default constructor that call parent constructor and pass the 3 approriate value "large", "grey", "eat other fish"

Same for Clownfish class


**3. Dolphins are not exactly fish, yet, they are good swimmers**
**a. Can you model a dolphin that swims without inheriting from a fish class?**
Create Dolphin class implements ICanSwim interface only
**b. How do you avoid duplicating code or introducing unneeded overhead?**
If the code is duplicate, put it in the common method

**D. Model animals that change their behaviour over time**
**1. Can you model a butterfly?
a. A butterfly can fly
b. A butterfly does not make a sound**
Create Butterfly class implements ICanFly interface only

**2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)**
Create Caterpillar class implements ICanWalk.
Have a state propery to indicate the metamorphosis status
override the walk method, different implementation depends on state

**E. Counting animals
Suppose you have an array of animals, e.g.
Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin(),
new Frog(),
new Dog(),
new Butterfly(),
new Cat()
};**
**Note: The above instantiation may be different if you chose to set up your object model
differently... (hopefully you did)**
**1. Can you share the code to count:
a. how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?**

Implement in Solution class

**BONUS**
**If you still have time left, please consider the following:**
**1. Can you add a second language (if you know a language other than English) Use the
rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds
differently depending on language. Please add the rooster sound in your native
tongue.**
I create the LangConfig which have the langMap property as type Map<String, Map<String, String>
this is the map that key is name of animal ("Rooster" for example), value is a map with key is lang, value is actual sound
