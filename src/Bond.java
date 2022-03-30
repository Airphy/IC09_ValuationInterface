import java.util.Objects;

public class Bond extends Security implements Comparable<Security>, Valuation{

    private double mPrincipal;
    private double mCouponRate;
    private double mHoldingPeriod;

    public Bond(String ISIN, String issuer, double principal, double couponRate, double holdingPeriod) {
        super(ISIN, issuer);
        mPrincipal = principal;
        mCouponRate = couponRate;
        mHoldingPeriod = holdingPeriod;
    }

    @Override
    public double percentReturn() {
        return mCouponRate * mHoldingPeriod;
    }

    @Override
    public double totalReturn() {
        return (mPrincipal * mCouponRate * mHoldingPeriod) / 100;
    }


    public double getPrincipal() {
        return mPrincipal;
    }

    public void setPrincipal(double principal) {
        mPrincipal = principal;
    }

    public double getCouponRate() {
        return mCouponRate;
    }

    public void setCouponRate(double couponRate) {
        mCouponRate = couponRate;
    }

    public double getHoldingPeriod() {
        return mHoldingPeriod;
    }

    public void setHoldingPeriod(double holdingPeriod) {
        mHoldingPeriod = holdingPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bond bond = (Bond) o;
        return Double.compare(bond.mPrincipal, mPrincipal) == 0 && Double.compare(bond.mCouponRate, mCouponRate) == 0 && Double.compare(bond.mHoldingPeriod, mHoldingPeriod) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mPrincipal, mCouponRate, mHoldingPeriod);
    }

    @Override
    public String toString() {
        return "Bond[" +
                mISIN + ", " + mIssuer +
                ", Principal: " + currency.format(mPrincipal) +
                ", Coupon:" + currency.format(mCouponRate) +
                ", Holding:" + mHoldingPeriod + " years" +
                ", Total Return: " + currency.format(totalReturn()) +
                ", Percent Return: " + twoDP.format(percentReturn()) + "%]";
    }
}
