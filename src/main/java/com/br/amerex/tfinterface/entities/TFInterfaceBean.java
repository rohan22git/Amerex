package com.br.amerex.tfinterface.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tf_Integererface")
public class TFInterfaceBean {
	Timestamp dt_create;
	String id_user_create;
	Timestamp dt_modified;
	String id_user_last_modified;
	Integer record_version;
	@Id
	Integer tran_id;
	String trade_type;
	String trade_sub_type;
	String source_system;
	String trade_ref;
	Integer trade_version;
	String trade_status;
	Timestamp entry_date;
	Timestamp trade_date;
	Timestamp value_date;
	String buy_sell;
	Double trd_quantity;
	Double trd_all_price;
	Double trd_principal;
	Double net_amount;
	String trade_ccy;
	Integer id_business;
	String customer_id;
	String cpty_customer_id;
	String cantor_sub_id;
	String broker_id_user_electronic;
	String brokerage_currency;
	Double brokerage;
	String gross_brokerage_currency;
	Double gross_brokerage;
	Integer suppress_validation_mask;
	Integer namd_validation_mask;
	String instrument_ref;
	String instrument_code;
	String instrument_descr;
	Double trade_repo_rate;
	Timestamp trade_start_date;
	Timestamp trade_end_date;
	Double trade_start_price;
	Double trade_end_price;
	String trade_leg_flag;
	String link_trd_ref;
	String electronic_voice;
	Double commission_rate;
	Double option_premium;
	String location;
	String exchange_ccy;
	Double exchange_rate;
	Double exchange_amount;
	Double fixed_rate;
	String floating_rate;
	String id_user_electronic;
	String trader_name;
	Integer id_clnt_le;
	String book_id;
	Double brokerage_rate;
	String active_passive;
	String alt_trade_ref_type;
	String alt_trade_ref;
	Double strike_price;
	Integer id_fxo_strategy;
	Integer id_fxo_class;
	Integer id_fxo_option_style;
	Integer id_fxo_exercise_style;
	String maturity;
	Integer id_city;
	Integer group_deal_structure;
	String linked_client;
	String exchange_code;
	Double clearing_fee;
	Double exchange_fee;
	String repo_collateral_type;
	String narrative;
	String field1;
	String field2;
	String field3;
	String field4;
	String field5;
	String field6;
	String field7;
	String field8;
	String field9;
	String field10;
	String field11;
	String field12;
	String field13;
	String field14;
	String field15;
	Double n_field1;
	Double n_field2;
	Double n_field3;
	Double n_field4;
	Double n_field5;
	String brokerage_calc_type;
	String brokerage_amend_reason;
	String id_business_group;
	String id_product_group;
	String id_product_type;
	String clearer_id;
	Integer contingency_flag;
	public Timestamp getDt_create() {
		return dt_create;
	}
	public void setDt_create(Timestamp dt_create) {
		this.dt_create = dt_create;
	}
	public String getId_user_create() {
		return id_user_create;
	}
	public void setId_user_create(String id_user_create) {
		this.id_user_create = id_user_create;
	}
	public Timestamp getDt_modified() {
		return dt_modified;
	}
	public void setDt_modified(Timestamp dt_modified) {
		this.dt_modified = dt_modified;
	}
	public String getId_user_last_modified() {
		return id_user_last_modified;
	}
	public void setId_user_last_modified(String id_user_last_modified) {
		this.id_user_last_modified = id_user_last_modified;
	}
	public Integer getRecord_version() {
		return record_version;
	}
	public void setRecord_version(Integer record_version) {
		this.record_version = record_version;
	}
	public Integer getTran_id() {
		return tran_id;
	}
	public void setTran_id(Integer tran_id) {
		this.tran_id = tran_id;
	}
	public String getTrade_type() {
		return trade_type;
	}
	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}
	public String getTrade_sub_type() {
		return trade_sub_type;
	}
	public void setTrade_sub_type(String trade_sub_type) {
		this.trade_sub_type = trade_sub_type;
	}
	public String getSource_system() {
		return source_system;
	}
	public void setSource_system(String source_system) {
		this.source_system = source_system;
	}
	public String getTrade_ref() {
		return trade_ref;
	}
	public void setTrade_ref(String trade_ref) {
		this.trade_ref = trade_ref;
	}
	public Integer getTrade_version() {
		return trade_version;
	}
	public void setTrade_version(Integer trade_version) {
		this.trade_version = trade_version;
	}
	public String getTrade_status() {
		return trade_status;
	}
	public void setTrade_status(String trade_status) {
		this.trade_status = trade_status;
	}
	public Timestamp getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Timestamp entry_date) {
		this.entry_date = entry_date;
	}
	public Timestamp getTrade_date() {
		return trade_date;
	}
	public void setTrade_date(Timestamp trade_date) {
		this.trade_date = trade_date;
	}
	public Timestamp getValue_date() {
		return value_date;
	}
	public void setValue_date(Timestamp value_date) {
		this.value_date = value_date;
	}
	public String getBuy_sell() {
		return buy_sell;
	}
	public void setBuy_sell(String buy_sell) {
		this.buy_sell = buy_sell;
	}
	public Double getTrd_quantity() {
		return trd_quantity;
	}
	public void setTrd_quantity(Double trd_quantity) {
		this.trd_quantity = trd_quantity;
	}
	public Double getTrd_all_price() {
		return trd_all_price;
	}
	public void setTrd_all_price(Double trd_all_price) {
		this.trd_all_price = trd_all_price;
	}
	public Double getTrd_principal() {
		return trd_principal;
	}
	public void setTrd_principal(Double trd_principal) {
		this.trd_principal = trd_principal;
	}
	public Double getNet_amount() {
		return net_amount;
	}
	public void setNet_amount(Double net_amount) {
		this.net_amount = net_amount;
	}
	public String getTrade_ccy() {
		return trade_ccy;
	}
	public void setTrade_ccy(String trade_ccy) {
		this.trade_ccy = trade_ccy;
	}
	public Integer getId_business() {
		return id_business;
	}
	public void setId_business(Integer id_business) {
		this.id_business = id_business;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCpty_customer_id() {
		return cpty_customer_id;
	}
	public void setCpty_customer_id(String cpty_customer_id) {
		this.cpty_customer_id = cpty_customer_id;
	}
	public String getCantor_sub_id() {
		return cantor_sub_id;
	}
	public void setCantor_sub_id(String cantor_sub_id) {
		this.cantor_sub_id = cantor_sub_id;
	}
	public String getBroker_id_user_electronic() {
		return broker_id_user_electronic;
	}
	public void setBroker_id_user_electronic(String broker_id_user_electronic) {
		this.broker_id_user_electronic = broker_id_user_electronic;
	}
	public String getBrokerage_currency() {
		return brokerage_currency;
	}
	public void setBrokerage_currency(String brokerage_currency) {
		this.brokerage_currency = brokerage_currency;
	}
	public Double getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(Double brokerage) {
		this.brokerage = brokerage;
	}
	public String getGross_brokerage_currency() {
		return gross_brokerage_currency;
	}
	public void setGross_brokerage_currency(String gross_brokerage_currency) {
		this.gross_brokerage_currency = gross_brokerage_currency;
	}
	public Double getGross_brokerage() {
		return gross_brokerage;
	}
	public void setGross_brokerage(Double gross_brokerage) {
		this.gross_brokerage = gross_brokerage;
	}
	public Integer getSuppress_validation_mask() {
		return suppress_validation_mask;
	}
	public void setSuppress_validation_mask(Integer suppress_validation_mask) {
		this.suppress_validation_mask = suppress_validation_mask;
	}
	public Integer getNamd_validation_mask() {
		return namd_validation_mask;
	}
	public void setNamd_validation_mask(Integer namd_validation_mask) {
		this.namd_validation_mask = namd_validation_mask;
	}
	public String getInstrument_ref() {
		return instrument_ref;
	}
	public void setInstrument_ref(String instrument_ref) {
		this.instrument_ref = instrument_ref;
	}
	public String getInstrument_code() {
		return instrument_code;
	}
	public void setInstrument_code(String instrument_code) {
		this.instrument_code = instrument_code;
	}
	public String getInstrument_descr() {
		return instrument_descr;
	}
	public void setInstrument_descr(String instrument_descr) {
		this.instrument_descr = instrument_descr;
	}
	public Double getTrade_repo_rate() {
		return trade_repo_rate;
	}
	public void setTrade_repo_rate(Double trade_repo_rate) {
		this.trade_repo_rate = trade_repo_rate;
	}
	public Timestamp getTrade_start_date() {
		return trade_start_date;
	}
	public void setTrade_start_date(Timestamp trade_start_date) {
		this.trade_start_date = trade_start_date;
	}
	public Timestamp getTrade_end_date() {
		return trade_end_date;
	}
	public void setTrade_end_date(Timestamp trade_end_date) {
		this.trade_end_date = trade_end_date;
	}
	public Double getTrade_start_price() {
		return trade_start_price;
	}
	public void setTrade_start_price(Double trade_start_price) {
		this.trade_start_price = trade_start_price;
	}
	public Double getTrade_end_price() {
		return trade_end_price;
	}
	public void setTrade_end_price(Double trade_end_price) {
		this.trade_end_price = trade_end_price;
	}
	public String getTrade_leg_flag() {
		return trade_leg_flag;
	}
	public void setTrade_leg_flag(String trade_leg_flag) {
		this.trade_leg_flag = trade_leg_flag;
	}
	public String getLink_trd_ref() {
		return link_trd_ref;
	}
	public void setLink_trd_ref(String link_trd_ref) {
		this.link_trd_ref = link_trd_ref;
	}
	public String getElectronic_voice() {
		return electronic_voice;
	}
	public void setElectronic_voice(String electronic_voice) {
		this.electronic_voice = electronic_voice;
	}
	public Double getCommission_rate() {
		return commission_rate;
	}
	public void setCommission_rate(Double commission_rate) {
		this.commission_rate = commission_rate;
	}
	public Double getOption_premium() {
		return option_premium;
	}
	public void setOption_premium(Double option_premium) {
		this.option_premium = option_premium;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExchange_ccy() {
		return exchange_ccy;
	}
	public void setExchange_ccy(String exchange_ccy) {
		this.exchange_ccy = exchange_ccy;
	}
	public Double getExchange_rate() {
		return exchange_rate;
	}
	public void setExchange_rate(Double exchange_rate) {
		this.exchange_rate = exchange_rate;
	}
	public Double getExchange_amount() {
		return exchange_amount;
	}
	public void setExchange_amount(Double exchange_amount) {
		this.exchange_amount = exchange_amount;
	}
	public Double getFixed_rate() {
		return fixed_rate;
	}
	public void setFixed_rate(Double fixed_rate) {
		this.fixed_rate = fixed_rate;
	}
	public String getFloating_rate() {
		return floating_rate;
	}
	public void setFloating_rate(String floating_rate) {
		this.floating_rate = floating_rate;
	}
	public String getId_user_electronic() {
		return id_user_electronic;
	}
	public void setId_user_electronic(String id_user_electronic) {
		this.id_user_electronic = id_user_electronic;
	}
	public String getTrader_name() {
		return trader_name;
	}
	public void setTrader_name(String trader_name) {
		this.trader_name = trader_name;
	}
	public Integer getId_clnt_le() {
		return id_clnt_le;
	}
	public void setId_clnt_le(Integer id_clnt_le) {
		this.id_clnt_le = id_clnt_le;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public Double getBrokerage_rate() {
		return brokerage_rate;
	}
	public void setBrokerage_rate(Double brokerage_rate) {
		this.brokerage_rate = brokerage_rate;
	}
	public String getActive_passive() {
		return active_passive;
	}
	public void setActive_passive(String active_passive) {
		this.active_passive = active_passive;
	}
	public String getAlt_trade_ref_type() {
		return alt_trade_ref_type;
	}
	public void setAlt_trade_ref_type(String alt_trade_ref_type) {
		this.alt_trade_ref_type = alt_trade_ref_type;
	}
	public String getAlt_trade_ref() {
		return alt_trade_ref;
	}
	public void setAlt_trade_ref(String alt_trade_ref) {
		this.alt_trade_ref = alt_trade_ref;
	}
	public Double getStrike_price() {
		return strike_price;
	}
	public void setStrike_price(Double strike_price) {
		this.strike_price = strike_price;
	}
	public Integer getId_fxo_strategy() {
		return id_fxo_strategy;
	}
	public void setId_fxo_strategy(Integer id_fxo_strategy) {
		this.id_fxo_strategy = id_fxo_strategy;
	}
	public Integer getId_fxo_class() {
		return id_fxo_class;
	}
	public void setId_fxo_class(Integer id_fxo_class) {
		this.id_fxo_class = id_fxo_class;
	}
	public Integer getId_fxo_option_style() {
		return id_fxo_option_style;
	}
	public void setId_fxo_option_style(Integer id_fxo_option_style) {
		this.id_fxo_option_style = id_fxo_option_style;
	}
	public Integer getId_fxo_exercise_style() {
		return id_fxo_exercise_style;
	}
	public void setId_fxo_exercise_style(Integer id_fxo_exercise_style) {
		this.id_fxo_exercise_style = id_fxo_exercise_style;
	}
	public String getMaturity() {
		return maturity;
	}
	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}
	public Integer getId_city() {
		return id_city;
	}
	public void setId_city(Integer id_city) {
		this.id_city = id_city;
	}
	public Integer getGroup_deal_structure() {
		return group_deal_structure;
	}
	public void setGroup_deal_structure(Integer group_deal_structure) {
		this.group_deal_structure = group_deal_structure;
	}
	public String getLinked_client() {
		return linked_client;
	}
	public void setLinked_client(String linked_client) {
		this.linked_client = linked_client;
	}
	public String getExchange_code() {
		return exchange_code;
	}
	public void setExchange_code(String exchange_code) {
		this.exchange_code = exchange_code;
	}
	public Double getClearing_fee() {
		return clearing_fee;
	}
	public void setClearing_fee(Double clearing_fee) {
		this.clearing_fee = clearing_fee;
	}
	public Double getExchange_fee() {
		return exchange_fee;
	}
	public void setExchange_fee(Double exchange_fee) {
		this.exchange_fee = exchange_fee;
	}
	public String getRepo_collateral_type() {
		return repo_collateral_type;
	}
	public void setRepo_collateral_type(String repo_collateral_type) {
		this.repo_collateral_type = repo_collateral_type;
	}
	public String getNarrative() {
		return narrative;
	}
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}
	public String getField4() {
		return field4;
	}
	public void setField4(String field4) {
		this.field4 = field4;
	}
	public String getField5() {
		return field5;
	}
	public void setField5(String field5) {
		this.field5 = field5;
	}
	public String getField6() {
		return field6;
	}
	public void setField6(String field6) {
		this.field6 = field6;
	}
	public String getField7() {
		return field7;
	}
	public void setField7(String field7) {
		this.field7 = field7;
	}
	public String getField8() {
		return field8;
	}
	public void setField8(String field8) {
		this.field8 = field8;
	}
	public String getField9() {
		return field9;
	}
	public void setField9(String field9) {
		this.field9 = field9;
	}
	public String getField10() {
		return field10;
	}
	public void setField10(String field10) {
		this.field10 = field10;
	}
	public String getField11() {
		return field11;
	}
	public void setField11(String field11) {
		this.field11 = field11;
	}
	public String getField12() {
		return field12;
	}
	public void setField12(String field12) {
		this.field12 = field12;
	}
	public String getField13() {
		return field13;
	}
	public void setField13(String field13) {
		this.field13 = field13;
	}
	public String getField14() {
		return field14;
	}
	public void setField14(String field14) {
		this.field14 = field14;
	}
	public String getField15() {
		return field15;
	}
	public void setField15(String field15) {
		this.field15 = field15;
	}
	public Double getN_field1() {
		return n_field1;
	}
	public void setN_field1(Double n_field1) {
		this.n_field1 = n_field1;
	}
	public Double getN_field2() {
		return n_field2;
	}
	public void setN_field2(Double n_field2) {
		this.n_field2 = n_field2;
	}
	public Double getN_field3() {
		return n_field3;
	}
	public void setN_field3(Double n_field3) {
		this.n_field3 = n_field3;
	}
	public Double getN_field4() {
		return n_field4;
	}
	public void setN_field4(Double n_field4) {
		this.n_field4 = n_field4;
	}
	public Double getN_field5() {
		return n_field5;
	}
	public void setN_field5(Double n_field5) {
		this.n_field5 = n_field5;
	}
	public String getBrokerage_calc_type() {
		return brokerage_calc_type;
	}
	public void setBrokerage_calc_type(String brokerage_calc_type) {
		this.brokerage_calc_type = brokerage_calc_type;
	}
	public String getBrokerage_amend_reason() {
		return brokerage_amend_reason;
	}
	public void setBrokerage_amend_reason(String brokerage_amend_reason) {
		this.brokerage_amend_reason = brokerage_amend_reason;
	}
	public String getId_business_group() {
		return id_business_group;
	}
	public void setId_business_group(String id_business_group) {
		this.id_business_group = id_business_group;
	}
	public String getId_product_group() {
		return id_product_group;
	}
	public void setId_product_group(String id_product_group) {
		this.id_product_group = id_product_group;
	}
	public String getId_product_type() {
		return id_product_type;
	}
	public void setId_product_type(String id_product_type) {
		this.id_product_type = id_product_type;
	}
	public String getClearer_id() {
		return clearer_id;
	}
	public void setClearer_id(String clearer_id) {
		this.clearer_id = clearer_id;
	}
	public Integer getContingency_flag() {
		return contingency_flag;
	}
	public void setContingency_flag(Integer contingency_flag) {
		this.contingency_flag = contingency_flag;
	}
	
	
	
}
