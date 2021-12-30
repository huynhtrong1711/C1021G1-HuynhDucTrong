package ss23_behavioral_design_pattern.thuc_hanh.trien_khai_strategy;

import java.util.List;

public interface ISortStrategy {
    <T> void sort(List<T> items);
}
