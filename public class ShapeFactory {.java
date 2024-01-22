public class ShapeFactory {
   // Create an instance of the ShapeFactory
   private static final ShapeFactory instance = new ShapeFactory();

   // Private constructor to prevent instantiation from outside
   private ShapeFactory() {
   }

   // Provide a method to access the singleton instance
   public static ShapeFactory getInstance() {g
      return instance;
   }

   public Shape getShape(String shapeType) {
      if (shapeType == null) {
         return null;
      }
      if (shapeType.equalsIgnoreCase("RECTANGLE")) {
         return new Rectangle();
      } else if (shapeType.equalsIgnoreCase("SQUARE")) {
         return new Square();
      }
      return null;
   }
}
public class FactoryPatternDemo {
   public static void main(String[] args) {
      // Get the singleton instance of ShapeFactory
      ShapeFactory shapeFactory = ShapeFactory.getInstance();

      // Use the factory to create shapes
      Shape shape1 = shapeFactory.getShape("CIRCLE");
      if (shape1 != null) {
         shape1.draw();
      } else {
         System.out.println("Invalid shape type");
      }

      Shape shape2 =s shapeFactory.getShape("RECTANGLE");
      if (shape2 != null) {
         shape2.draw();
      } else {
         System.out.println("Invalid shape type");
      }
   }
}
