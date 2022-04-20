package lambda;
//functional interface: la cac interface co duy nhat mot method triu tuong
//de sd no ta them annotation @FunctionalInterface

@FunctionalInterface
public interface AddNumber {
    public int sum(int numb1, int num2);
}
