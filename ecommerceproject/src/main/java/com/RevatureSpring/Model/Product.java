package com.RevatureSpring.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import  lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="Product")
public class Product {
@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)

  private   int pizza_id;
@Column
  private String name;
@Column
  private int price;
@Column
  private  String descr;
}
