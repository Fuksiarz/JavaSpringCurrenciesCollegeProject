package projekt.jazs21488nbp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Rate{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String no;

    private String effectiveDate;

    private double mid;

    public Rate() {
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public String getNo() {
        return no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public double getMid() {
        return mid;
    }
}
